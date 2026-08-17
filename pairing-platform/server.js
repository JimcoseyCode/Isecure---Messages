import express from 'express';
import cors from 'cors';
import { exec } from 'child_process';
import { fileURLToPath } from 'url';
import { dirname, join } from 'path';

const __filename = fileURLToPath(import.meta.url);
const __dirname = dirname(__filename);

const app = express();
app.use(cors());
app.use(express.static(join(__dirname, 'dist')));

app.get('/api/simulate', (req, res) => {
  exec('cargo run --bin simulate_pairing --features ffi --manifest-path ../ov-core/Cargo.toml', { cwd: __dirname }, (error, stdout, stderr) => {
    if (error) {
      console.error(error);
      return res.status(500).json({ error: 'Failed to simulate pairing' });
    }
    try {
      const data = JSON.parse(stdout.split('\n').filter(l => l.startsWith('{') || l.startsWith('}') || l.includes('sms') || l.includes('sas') || l.includes('partyA') || l.includes('partyB') || l.includes(': {')).join('\n'));
      res.json(data);
    } catch (e) {
      console.error("Parse error:", e, "Stdout:", stdout);
      // fallback parsing if cargo outputs extra lines
      const match = stdout.match(/\{[\s\S]*\}/);
      if (match) {
        res.json(JSON.parse(match[0]));
      } else {
        res.status(500).json({ error: 'Failed to parse output' });
      }
    }
  });
});

const PORT = 3000;
app.listen(PORT, () => console.log(`Server running on port ${PORT}`));
