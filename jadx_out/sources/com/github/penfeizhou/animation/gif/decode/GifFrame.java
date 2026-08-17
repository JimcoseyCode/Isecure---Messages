package com.github.penfeizhou.animation.gif.decode;

import M3.c;
import M3.i;
import M3.j;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.github.penfeizhou.animation.decode.a;
import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class GifFrame extends a {
    private static final int DEFAULT_DELAY = 10;
    private static final ThreadLocal<byte[]> sDataBlock;
    public final c colorTable;
    public final int disposalMethod;
    private final int imageDataOffset;
    private final boolean interlace;
    private final int lzwMinCodeSize;
    public final int transparentColorIndex;

    static {
        System.loadLibrary("animation-decoder-gif");
        sDataBlock = new ThreadLocal<>();
    }

    public GifFrame(GifReader gifReader, c cVar, i iVar, j jVar) {
        super(gifReader);
        if (iVar != null) {
            this.disposalMethod = iVar.c();
            int i10 = iVar.f7470c;
            this.frameDuration = (i10 <= 0 ? 10 : i10) * 10;
            if (iVar.d()) {
                this.transparentColorIndex = iVar.f7471d;
            } else {
                this.transparentColorIndex = -1;
            }
        } else {
            this.disposalMethod = 0;
            this.transparentColorIndex = -1;
        }
        this.frameX = jVar.f7472a;
        this.frameY = jVar.f7473b;
        this.frameWidth = jVar.f7474c;
        this.frameHeight = jVar.f7475d;
        this.interlace = jVar.b();
        if (jVar.c()) {
            this.colorTable = jVar.f7477f;
        } else {
            this.colorTable = cVar;
        }
        this.lzwMinCodeSize = jVar.f7478g;
        this.imageDataOffset = jVar.f7479h;
    }

    private native void uncompressLZW(GifReader gifReader, int[] iArr, int i10, int[] iArr2, int i11, int i12, int i13, boolean z10, byte[] bArr);

    public void encode(int[] iArr, int i10) throws IOException {
        ((GifReader) this.reader).reset();
        ((GifReader) this.reader).skip(this.imageDataOffset);
        ThreadLocal<byte[]> threadLocal = sDataBlock;
        byte[] bArr = threadLocal.get();
        if (bArr == null) {
            bArr = new byte[255];
            threadLocal.set(bArr);
        }
        uncompressLZW((GifReader) this.reader, this.colorTable.b(), this.transparentColorIndex, iArr, this.frameWidth / i10, this.frameHeight / i10, this.lzwMinCodeSize, this.interlace, bArr);
    }

    public boolean transparencyFlag() {
        return this.transparentColorIndex >= 0;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    public Bitmap draw(Canvas canvas, Paint paint, int i10, Bitmap bitmap, N3.a aVar) {
        try {
            aVar.c((this.frameWidth * this.frameHeight) / (i10 * i10));
            encode(aVar.b(), i10);
            bitmap.copyPixelsFromBuffer(aVar.a().rewind());
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = bitmap.getWidth();
            this.srcRect.bottom = bitmap.getHeight();
            Rect rect2 = this.dstRect;
            int i11 = this.frameX;
            float f10 = i10;
            rect2.left = (int) (i11 / f10);
            rect2.top = (int) (this.frameY / f10);
            rect2.right = (int) ((i11 / f10) + bitmap.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f10) + bitmap.getHeight());
            canvas.drawBitmap(bitmap, this.srcRect, this.dstRect, paint);
            return bitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
            return bitmap;
        }
    }
}
