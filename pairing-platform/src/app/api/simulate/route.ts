import { NextResponse } from 'next/server';
import { exec } from 'child_process';
import path from 'path';

export async function POST(req: Request) {
  try {
    const body = await req.json();
    const cwd = path.join(process.cwd(), '..');
    
    return new Promise((resolve) => {
      const child = exec(
        'cargo run --quiet --bin interactive_pairing --features ffi --manifest-path ov-core/Cargo.toml',
        { cwd },
        (error, stdout, stderr) => {
          if (error) {
            console.error("Execution error:", error, stderr);
            resolve(NextResponse.json({ error: 'Failed to execute pairing script' }, { status: 500 }));
            return;
          }
          
          try {
            const data = JSON.parse(stdout);
            resolve(NextResponse.json(data));
          } catch (e) {
             const match = stdout.match(/\{[\s\S]*\}/);
             if (match) {
               resolve(NextResponse.json(JSON.parse(match[0])));
             } else {
               resolve(NextResponse.json({ error: 'Failed to parse output', stdout }, { status: 500 }));
             }
          }
        }
      );
      
      // Send input to stdin
      child.stdin?.write(JSON.stringify(body));
      child.stdin?.end();
    });
  } catch (error: any) {
    console.error("API error:", error);
    return NextResponse.json({ error: 'Internal server error', details: error.message }, { status: 500 });
  }
}

export async function PUT(req: Request) {
  // Dummy endpoint for intercept
  try {
    const { sms_a, sms_b } = await req.json();
    return NextResponse.json({
      error: "Cryptographically impossible",
      message: "Les codes fournis sont des clés publiques. Le secret partagé (ssPq et ssEc) est manquant car il nécessite la clé privée générée sur l'appareil. Le SAS à 12 caractères ne peut pas être dérivé sans ce secret."
    });
  } catch (e) {
    return NextResponse.json({ error: "Invalid request" }, { status: 400 });
  }
}
