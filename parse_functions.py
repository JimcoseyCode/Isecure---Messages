import re

with open('bundle_disassembled.txt', 'r') as f:
    data = f.read()

def extract_function(name, func_id=None):
    if func_id:
        pattern = f"=> \\[Function #{func_id}.*?\n\n==============="
    else:
        pattern = f"=> \\[Function #\\d+ \"{name}\".*?\n\n==============="
    match = re.search(pattern, data, re.DOTALL)
    if match:
        print(match.group(0))
    else:
        print(f"Function {name} not found")

extract_function("deriveMessageSubKey")
extract_function("getDerivedCharsets")
extract_function("createSeededPRNG")
extract_function("deterministicShuffle")
extract_function("deriveCharset")
extract_function("b36") # just in case
