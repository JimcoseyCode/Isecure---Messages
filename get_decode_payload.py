import re

with open('bundle_disassembled.txt', 'r') as f:
    data = f.read()

def extract_function(func_id):
    pattern = f"=> \\[Function #{func_id}.*?\n\n==============="
    match = re.search(pattern, data, re.DOTALL)
    if match:
        print(match.group(0))
    else:
        print(f"Function {func_id} not found")

extract_function("15092")
extract_function("15094")
