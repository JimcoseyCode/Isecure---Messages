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
    for (let i = 0; i < len; i++) bytes[len - 1 - i] = (n >> (i * 8)) & 0xff;
    return bytes;
}
function fromHex(hexStr) {
    return Uint8Array.from(Buffer.from(hexStr, 'hex'));
}
function hkdfExtract(salt, ikm) {
    return crypto.createHmac('sha256', salt).update(ikm).digest();
}
function hkdfExpand(prk, info, len) {
    const t1 = crypto.createHmac('sha256', prk).update(info).update(Buffer.from([1])).digest();
    return t1.subarray(0, len);
}
function hashSha256(bytes) { return crypto.createHash('sha256').update(bytes).digest(); }
function hashShake32(bytes) { return crypto.createHash('shake256', { outputLength: 32 }).update(bytes).digest(); }
function hashShake64(bytes) { return crypto.createHash('shake256', { outputLength: 64 }).update(bytes).digest(); }

const ss_pq = fromHex("fd7dfab2f10a2e16e0c20135c187ad0b18c4bc54a6b71197cd19eeb1ea01bc11");
const ss_ec = fromHex("96beb64dcdd4ebd732edc97dab6f87e80ce2277540b85dcc86a16480c4be4837");
const ct = fromHex("c1679c4338c9d3ff612ef6445fd42eb3155465579988c44fbd282fc5269e6e5331c41e8f565e7d39756ee6b728c9b4f32e2fac58fb876ddbab6ffb092f3829cb94b797c0dcbb7c0b4819725cfd2c2d11f8886071f908b71fb89030ca80afde118202821529eacfe8f1e09bfd2299f5c10a278ff262c1aef90b23713b84d7ac7f9e17ef51434414d634bdb78bfbc9e07fa849dcb68721cdd53c0a2626af9b4094b93fbe9bc9abeaacd20dcdb3b2a6865ff7b30a9f5b2399b044d2db61add857ad0d9f1ecb117f6bab57e95b8ae2128cce62ad3f89ce1d9678955d4cfd66f122ab02736165ae36c4c84c09e7a8563a151f54a9cc09be088243e7f41f51f89db35566ef4f4008ee3564efffc23f57f167bdf71b77631c3a07918925d9ee57588fdfd4ea2bfd82aee8beaad399b7d5e5950829cdd57102cea2bfc42140f5c942613268367af1855ab83bbff90066c967de2f37c713486bba9346b79d754a8a63ffcbb1919ea585f482ff9906dbae52e99996d1d894ec5312b4cb5db5daec9bd36d32c0afef53aa09f552f84abb235f89182d1fd7a80538cd94275516eb3e8a5d463e1cc9192e6cddbfaa99ea7418cfb821e098a3f21f4c808963d0e7ebdec52e6dfc820148f4bbe71ac0f380797243b67aea6ad544a7e59955f71f7c6ec0cebd5d096e7a09d22bb3f457a30e26bb221ee6b06238b1d9c17425871f13f0424cf0bf457d4357c273bf198f81ea334996f30f0a269a5aad15a8d63813e7cb383610bd5127d2eb79c91faebccd1fa2cdbc1c9be14a7b864222dcac7bc9d6c3a17ef2b82dff27428526e15445e33caaef488e1bf6ec15f52dd32cb9eea73ace38084d3b7c80d7afc17da0d513dfb95602e714a98e09ee9b709d761c83a36a7eaa4a07733cfce96c95733c96dfafecaba657efb7d6d77a545398260f7facc866e438872c3fdf0a80faab3f7bf8067a3375f5232ffbdbd5242a93c481add2530bb0e9607756432deaf873a08360f27028f06a303bd538ed770b6201c21e30b17aceaf94afd71983544554c37601cca5b7ae24700809e8440dc694c00ddadce4d2f62831c5052993203ddd8b1c951cdbbae5ae7f6c2b8cc825e27837fa293368360505734442e7b06d3b1db90ffa7b772a2c4f18e3227ffd198d4802042e5e36e901989de0346d225fa75df92db8271cabe2116058095842ca0e2c0385fea8c08a76c5411b4804e7b9b47a6e5bd3a54e5b1cdcd3a5cf455f127def36f5651e4822c09d84210d21400b1f582554266c3a53a1b31bc562d783cb837c0ca916d5f19b1d3d5389e654f072616109efc17635b1755cac10af628de2198a1430c8abf73dbc7d140d130557f1d65273e7f9488d0d07de728907d8ffd20e9b321ab130324f811fb32bb29746ef95b5347befc60c167f549785397dc6561be126f5abf142beb728f8f09b99bd1a06f94e381364b66c1ace28da4f40150824bb0b04e6c373b984649b91a23d74e16ac0eeca03b04d5bc2c5ba87c3638986838d8199ce912e7e66f62b3c6b255e44977df7ea1d9d2ac6e18d9a0500afdad648252c7a0cdbd134aba8429f6e");
const pk = fromHex("fd2a8d501c3f7cf3303af6995c0248989caa54b57597037317462857d1c067ac7015845520171213730999897d3fe17f7e6796f5fc2071a2b67515ce0f8b5a15773a42f05d72b6277781cead7940f3d37234c7b2982a7884e2536ef60f2e6b79de55598a5c7f90160d72e000e7cca267313a5f090c03282a1e94957eda08e802be17429ac74196a8a07290c69373e7cb791aa5302016a7824f81db48abb31b66381e0bb86159b85ec0a48dda6187669121dbe066686b6076a5aeb0d7196e17c76028c5af490b9ad8cc13f7c2f975346bb8ac0ebabe7a9277811b03fa8aa92a97343c451d0df67085e4a805d151cb5a64faf79a80bb0845f42719da3202cc2621f3907ea55cd44a580192c2ccc69148f7c40b20b89bd421e1406cd3f34e02570d0dc78b0f3748cff6651ee23323ab76792483b1538376b29fa022374706a9cb52947f4606bff55e7c9573613ccebccb53f5b23d53e80c02db939c6518abbc42673abe354ba85adcbc7ba84e85f4204c29c8a3f2b359437ba0178e20c021206068b1632754cb210542075859856eab644f48ce4d2aa517a54f9b8b8b32920e80b17dea1016566494a8c362045a54d9a56e59b7b517305d5c53180e719e15304028ec8dff9c65a4e4bd0c12b50c352d80424301a012ce03babe841438e7b445a0595d57c4ae32260ab64478650131522f70a41a473b81c21a3ce57448fea886f4b04e9fbc4d39f84c5a522cb9cb628dac9ba5409fdbd4518d629ed8e01d76f70d8b696148d57a7da6b3ad47b684f22d87d9406be6b7daa066f59910fad2c975c7ab47022d43d85f6507a30af39a36b78620262566eb84c4f45f87b9179829098f418810b42dae72aa6b4a8e5435c6a6309300b73518949c13b5b9cb63a66dab44d9d5b468c13252f58811dac008806cb10c92e844a30926cae91590022075c2c96276201bb3c16d36144b8c62622b9253339b5e8d98c43d900386d084a25c6cc41c8478f917a239b82d60c6b5886088cb31177790eef1148fcb26cffaa79a1a5d480a0792028de22787aa2534af6593d4a77ebdb88b6ebb06fc97c846931109b85b85fb5096085c89810904396a33a62a44592643f09cb1ca639530591a4cb6e9066e1a1789d5675628c9cd7ad70ae61463dbd04c55ac1eb67847088a65eef9ced5199097014aba69536843694480708b741d314a692259961a87203dc71d7ef57601b52289901acc742585515786363a14da9bf5034c10da223c31271305a2b1c77232d8a18e5647c69b23cdf32b17a762b5807ba4a1ab4ca87e0759a52ed6b586a044125c0fe4bb390ba9793e4caddac927b1410cf5637c0d19ab90d8a922c94a1841a85c93050e634c4d6105d01a3104f168582103285c5ffb059e409641e8bb7a2462ada4ac7a0672bf1a613091956e03bc62b4c8c9416330c3232fe5f310511111fbe69b71ac51b8b57afd33b3a1fccc7639547e53265d0b2d2824a2d271063cfa6341c0426204460aa1205589b13e2924245456370790f0bb9a931390b40108a8a078c7f114b3b0cea429130eb96c996936abf5699d1385ed93bc2f5143a7788033362ef3fa3331b8b980942273e60f376c8e467c1951d5b041da49910960b769d3ed55f3684febbb5476911738cdc9890b3697354a5fba152fd5a6475fea");
const ct_pq = ct.slice(0, 1088);
const ct_ec = ct.slice(1088);
const pk_pq = pk.slice(0, 1184);
const pk_ec = pk.slice(1184);

const target = "350E6E63A652";
const sasSalt = crypto.createHash('sha256').update("OV_PQHybrid_Salt_v1").digest();
const infoSas = Buffer.concat([Buffer.from("OV_PQHybrid_SAS_v1"), Buffer.from([1])]);

function sas(shared) {
    const prkSas = crypto.createHmac('sha256', sasSalt).update(shared).digest();
    return crypto.createHmac('sha256', prkSas).update(infoSas).digest().subarray(0, 6).toString('hex').toUpperCase();
}

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

const els = [
    { name: 'ss_pq', raw: ss_pq, s32: hashShake32(ss_pq) },
    { name: 'ss_ec', raw: ss_ec, s32: hashShake32(ss_ec) },
    { name: 'ct_pq', raw: ct_pq, s32: hashShake32(ct_pq) },
    { name: 'ct_ec', raw: ct_ec, s32: hashShake32(ct_ec) },
    { name: 'pk_pq', raw: pk_pq, s32: hashShake32(pk_pq) },
    { name: 'pk_ec', raw: pk_ec, s32: hashShake32(pk_ec) },
];
const els4 = [
    { name: 'ss_pq', raw: ss_pq, s32: hashShake32(ss_pq) },
    { name: 'ss_ec', raw: ss_ec, s32: hashShake32(ss_ec) },
    { name: 'ct', raw: ct, s32: hashShake32(ct) },
    { name: 'pk', raw: pk, s32: hashShake32(pk) },
];

let allPerms = getPermutations(els).concat(getPermutations(els4));

const labels = [
    asciiToBytes('hybrid_prk'),
    asciiToBytes('KitchenSink-KEM(ML-KEM-768,X25519)-XOF(SHAKE256)-KDF(HKDF-SHA-256)'),
    asciiToBytes('shared_secret'),
    new Uint8Array(0)
];

const salts = [
    new Uint8Array(32), // hkdf default
    asciiToBytes("OV_PQHybrid_Salt_v1")
];

const infos = [
    new Uint8Array(0),
    asciiToBytes('shared_secret'),
    concatBytes(numberToBytesBE(32, 2), asciiToBytes('shared_secret'), new Uint8Array(0)),
    concatBytes(numberToBytesBE(32, 2), asciiToBytes('shared_secret'))
];

let tried = 0;
for (const p of allPerms) {
    for (const useS32 of [false, true]) {
        for (const label of labels) {
            for (const labelPos of [0, 1, 2]) { // 0: none, 1: front, 2: back
                for (const addHybridPrk of [false, true]) {
                    
                    let ikmParts = [];
                    if (addHybridPrk) ikmParts.push(asciiToBytes('hybrid_prk'));
                    if (labelPos === 1 && label.length > 0) ikmParts.push(label);
                    
                    for (const el of p) {
                        ikmParts.push(useS32 ? el.s32 : el.raw);
                    }
                    
                    if (labelPos === 2 && label.length > 0) ikmParts.push(label);
                    if (!addHybridPrk) ikmParts.push(asciiToBytes('hybrid_prk'));
                    
                    const ikm = concatBytes(...ikmParts);
                    
                    for (const salt of salts) {
                        for (const info of infos) {
                            tried++;
                            const prk = hkdfExtract(salt, ikm);
                            const shared = hkdfExpand(prk, info, 32);
                            
                            const finalSas = sas(shared);
                            if (finalSas === target) {
                                console.log("MATCH FOUND!");
                                console.log("Order:", p.map(x => x.name).join(', '));
                                console.log("useS32:", useS32);
                                console.log("label:", label.toString('ascii'));
                                console.log("labelPos:", labelPos);
                                console.log("addHybridPrk:", addHybridPrk);
                                console.log("salt:", salt.length === 32 && salt[0] === 0 ? "Zeros" : "OV_PQHybrid_Salt_v1");
                                console.log("info length:", info.length);
                                process.exit(0);
                            }
                        }
                    }
                }
            }
        }
    }
}
console.log("No match found after", tried, "combinations");
