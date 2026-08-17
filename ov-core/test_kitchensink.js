const crypto = require('crypto');

function concatBytes(...arrays) {
    let length = 0;
    for (let i = 0; i < arrays.length; i++) {
        length += arrays[i].length;
    }
    const result = new Uint8Array(length);
    let offset = 0;
    for (let i = 0; i < arrays.length; i++) {
        result.set(arrays[i], offset);
        offset += arrays[i].length;
    }
    return result;
}

function asciiToBytes(str) {
    const bytes = new Uint8Array(str.length);
    for (let i = 0; i < str.length; i++) bytes[i] = str.charCodeAt(i);
    return bytes;
}

function numberToBytesBE(n, len) {
    const bytes = new Uint8Array(len);
    for (let i = 0; i < len; i++) {
        bytes[len - 1 - i] = (n >> (i * 8)) & 0xff;
    }
    return bytes;
}

function fromHex(hexStr) {
    return Uint8Array.from(Buffer.from(hexStr, 'hex'));
}

function hkdfExtract(ikm) {
    // implicit zero salt (hashLen = 32 for sha256)
    const salt = new Uint8Array(32);
    return crypto.createHmac('sha256', salt).update(ikm).digest();
}

function hkdfExpand(prk, info, len) {
    const t1 = crypto.createHmac('sha256', prk).update(info).update(Buffer.from([1])).digest();
    return t1.subarray(0, len);
}

const ss_pq = fromHex("fd7dfab2f10a2e16e0c20135c187ad0b18c4bc54a6b71197cd19eeb1ea01bc11");
const ss_ec = fromHex("96beb64dcdd4ebd732edc97dab6f87e80ce2277540b85dcc86a16480c4be4837");
const ct = fromHex("");

const ct_pq = ct.slice(0, 1088);
const ct_ec = ct.slice(1088);

const pk = fromHex("fd2a8d501c3f7cf3303af6995c0248989caa54b57597037317462857d1c067ac7015845520171213730999897d3fe17f7e6796f5fc2071a2b67515ce0f8b5a15773a42f05d72b6277781cead7940f3d37234c7b2982a7884e2536ef60f2e6b79de55598a5c7f90160d72e000e7cca267313a5f090c03282a1e94957eda08e802be17429ac74196a8a07290c69373e7cb791aa5302016a7824f81db48abb31b66381e0bb86159b85ec0a48dda6187669121dbe066686b6076a5aeb0d7196e17c76028c5af490b9ad8cc13f7c2f975346bb8ac0ebabe7a9277811b03fa8aa92a97343c451d0df67085e4a805d151cb5a64faf79a80bb0845f42719da3202cc2621f3907ea55cd44a580192c2ccc69148f7c40b20b89bd421e1406cd3f34e02570d0dc78b0f3748cff6651ee23323ab76792483b1538376b29fa022374706a9cb52947f4606bff55e7c9573613ccebccb53f5b23d53e80c02db939c6518abbc42673abe354ba85adcbc7ba84e85f4204c29c8a3f2b359437ba0178e20c021206068b1632754cb210542075859856eab644f48ce4d2aa517a54f9b8b8b32920e80b17dea1016566494a8c362045a54d9a56e59b7b517305d5c53180e719e15304028ec8dff9c65a4e4bd0c12b50c352d80424301a012ce03babe841438e7b445a0595d57c4ae32260ab64478650131522f70a41a473b81c21a3ce57448fea886f4b04e9fbc4d39f84c5a522cb9cb628dac9ba5409fdbd4518d629ed8e01d76f70d8b696148d57a7da6b3ad47b684f22d87d9406be6b7daa066f59910fad2c975c7ab47022d43d85f6507a30af39a36b78620262566eb84c4f45f87b9179829098f418810b42dae72aa6b4a8e5435c6a6309300b73518949c13b5b9cb63a66dab44d9d5b468c13252f58811dac008806cb10c92e844a30926cae91590022075c2c96276201bb3c16d36144b8c62622b9253339b5e8d98c43d900386d084a25c6cc41c8478f917a239b82d60c6b5886088cb31177790eef1148fcb26cffaa79a1a5d480a0792028de22787aa2534af6593d4a77ebdb88b6ebb06fc97c846931109b85b85fb5096085c89810904396a33a62a44592643f09cb1ca639530591a4cb6e9066e1a1789d5675628c9cd7ad70ae61463dbd04c55ac1eb67847088a65eef9ced5199097014aba69536843694480708b741d314a692259961a87203dc71d7ef57601b52289901acc742585515786363a14da9bf5034c10da223c31271305a2b1c77232d8a18e5647c69b23cdf32b17a762b5807ba4a1ab4ca87e0759a52ed6b586a044125c0fe4bb390ba9793e4caddac927b1410cf5637c0d19ab90d8a922c94a1841a85c93050e634c4d6105d01a3104f168582103285c5ffb059e409641e8bb7a2462ada4ac7a0672bf1a613091956e03bc62b4c8c9416330c3232fe5f310511111fbe69b71ac51b8b57afd33b3a1fccc7639547e53265d0b2d2824a2d271063cfa6341c0426204460aa1205589b13e2924245456370790f0bb9a931390b40108a8a078c7f114b3b0cea429130eb96c996936abf5699d1385ed93bc2f5143a7788033362ef3fa3331b8b980942273e60f376c8e467c1951d5b041da49910960b769d3ed55f3684febbb5476911738cdc9890b3697354a5fba152fd5a6475fea");
const pk_pq = pk.slice(0, 1184);
const pk_ec = pk.slice(1184);

const elements = [
    { name: 'ss_pq', val: ss_pq },
    { name: 'ss_ec', val: ss_ec },
    { name: 'ct_pq', val: ct_pq },
    { name: 'ct_ec', val: ct_ec },
    { name: 'pk_pq', val: pk_pq },
    { name: 'pk_ec', val: pk_ec },
];

function getPermutations(arr) {
    if (arr.length === 0) return [[]];
    const result = [];
    for (let i = 0; i < arr.length; i++) {
        const rest = getPermutations(arr.slice(0, i).concat(arr.slice(i + 1)));
        for (const r of rest) {
            result.push([arr[i]].concat(r));
        }
    }
    return result;
}

const perms = getPermutations(elements);
const labelBytes = asciiToBytes('KitchenSink-KEM(ML-KEM-768,X25519)-XOF(SHAKE256)-KDF(HKDF-SHA-256)');
const hybridPrk = asciiToBytes('hybrid_prk');
const expandInfo = concatBytes(numberToBytesBE(32, 2), asciiToBytes('shared_secret'), asciiToBytes(''));
const sasSalt = crypto.createHash('sha256').update("OV_PQHybrid_Salt_v1").digest();
const infoSas = Buffer.concat([Buffer.from("OV_PQHybrid_SAS_v1"), Buffer.from([1])]);

const target = "350E6E63A652";

function hashSha256(bytes) { return crypto.createHash('sha256').update(bytes).digest(); }
function hashShake32(bytes) { return crypto.createHash('shake256', { outputLength: 32 }).update(bytes).digest(); }
function hashShake64(bytes) { return crypto.createHash('shake256', { outputLength: 64 }).update(bytes).digest(); }

const hashedElements = elements.map(e => ({
    name: e.name,
    raw: e.val,
    sha2: hashSha256(e.val),
    shake32: hashShake32(e.val),
    shake64: hashShake64(e.val)
}));

for (const choice of [0, 1, 2, 3]) {
    for (const p of getPermutations(hashedElements)) {
        let parts = [];
        for (const el of p) {
            if (choice === 0) parts.push(el.raw);
            else if (choice === 1) parts.push(el.sha2);
            else if (choice === 2) parts.push(el.shake32);
            else if (choice === 3) parts.push(el.shake64);
        }
        
        for (const labelFirst of [false, true]) {
            let preimageParts = [];
            if (labelFirst) preimageParts.push(labelBytes);
            preimageParts.push(...parts);
            if (!labelFirst) preimageParts.push(labelBytes);
            
            const preimage = concatBytes(...preimageParts);
            const ikm = concatBytes(hybridPrk, preimage);
            const prk = hkdfExtract(ikm);
            const shared = hkdfExpand(prk, expandInfo, 32);

            const prkSas = crypto.createHmac('sha256', sasSalt).update(shared).digest();
            const finalSas = crypto.createHmac('sha256', prkSas).update(infoSas).digest().subarray(0, 6).toString('hex').toUpperCase();

            if (finalSas === target) {
                console.log("MATCH FOUND!");
                console.log("Uniform Hash:", choice === 0 ? 'raw' : choice === 1 ? 'sha256' : choice === 2 ? 'shake32' : 'shake64');
                console.log("Order:", p.map(x => x.name).join(', '));
                console.log("Label First:", labelFirst);
                process.exit(0);
            }
        }
    }
}

const elements4 = [
    { name: 'ss_pq', val: ss_pq },
    { name: 'ss_ec', val: ss_ec },
    { name: 'ct', val: ct },
    { name: 'pk', val: pk },
];

for (const p of getPermutations(elements4)) {
    for (const choice of [0, 1, 2, 3]) {
        let parts = [];
        for (const el of p) {
            if (choice === 0) parts.push(el.val);
            else if (choice === 1) parts.push(hashSha256(el.val));
            else if (choice === 2) parts.push(hashShake32(el.val));
            else if (choice === 3) parts.push(hashShake64(el.val));
        }

        for (const labelFirst of [false, true]) {
            let preimageParts = [];
            if (labelFirst) preimageParts.push(labelBytes);
            preimageParts.push(...parts);
            if (!labelFirst) preimageParts.push(labelBytes);

            const preimage = concatBytes(...preimageParts);
            const ikm = concatBytes(hybridPrk, preimage);
            const prk = hkdfExtract(ikm);
            const shared = hkdfExpand(prk, expandInfo, 32);

            const prkSas = crypto.createHmac('sha256', sasSalt).update(shared).digest();
            const finalSas = crypto.createHmac('sha256', prkSas).update(infoSas).digest().subarray(0, 6).toString('hex').toUpperCase();

            if (finalSas === target) {
                console.log("MATCH FOUND!");
                console.log("Order:", p.map(x => x.name).join(', '));
                process.exit(0);
            }
        }
    }
}
console.log("No match found for 4 elements.");

const xwingPreimage = concatBytes(ss_pq, ss_ec, ct_ec, pk_ec, asciiToBytes('\\.//^\\'));
const xwingShared = crypto.createHash('sha3-256').update(xwingPreimage).digest();

const prkSas = crypto.createHmac('sha256', sasSalt).update(xwingShared).digest();
const finalSas = crypto.createHmac('sha256', prkSas).update(infoSas).digest().subarray(0, 6).toString('hex').toUpperCase();

console.log("X-Wing SAS computed by us:", finalSas);
