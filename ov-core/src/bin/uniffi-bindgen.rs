// Entry point for generating foreign-language bindings from the built library:
//   cargo run --features cli --bin uniffi-bindgen -- generate \
//       --library target/.../libov_core.so --language kotlin --out-dir <dir>
fn main() {
    uniffi::uniffi_bindgen_main()
}
