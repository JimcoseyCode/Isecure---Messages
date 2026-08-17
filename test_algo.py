import re

with open('contexte-claude-Isecure.txt', 'r', encoding='utf-8') as f:
    data = f.read()

# Let's extract exactly the parts describing the OV36 algorithm that Claude reverse-engineered.
lines = data.split('\n')
capturing = False
algo_desc = []
for line in lines:
    if 'OV36_PREFIX' in line or 'encode_ov36_message' in line or 'getSpecialCharSet' in line:
        capturing = True
    
    if capturing:
        algo_desc.append(line)
        if len(algo_desc) > 300: # Stop after a reasonable chunk to see what we have
            break

print('\n'.join(algo_desc))
