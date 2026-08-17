.class public final Lexpo/modules/kotlin/typedarray/Int8Array;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/typedarray/TypedArray;
.implements Lexpo/modules/kotlin/typedarray/GenericTypedArray;
.implements Lexpo/modules/kotlin/typedarray/RawTypedArrayHolder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/kotlin/typedarray/TypedArray;",
        "Lexpo/modules/kotlin/typedarray/GenericTypedArray<",
        "Ljava/lang/Byte;",
        ">;",
        "Lexpo/modules/kotlin/typedarray/RawTypedArrayHolder;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0008\n\u0002\u0010\n\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0096\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J(\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0018\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0018\u0010)\u001a\u00020(2\u0006\u0010\u0016\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008)\u0010*J \u0010+\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0001\u00a2\u0006\u0004\u0008+\u0010\u0010J \u0010,\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u001dH\u0096\u0001\u00a2\u0006\u0004\u0008,\u0010-J \u0010.\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008.\u0010/J \u00100\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\"H\u0096\u0001\u00a2\u0006\u0004\u00080\u00101J \u00102\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020%H\u0096\u0001\u00a2\u0006\u0004\u00082\u00103J \u00104\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020(H\u0096\u0001\u00a2\u0006\u0004\u00084\u00105R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00106\u001a\u0004\u00087\u00108R\u0014\u0010<\u001a\u0002098\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010;R\u0014\u0010?\u001a\u00020\t8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u0014\u0010A\u001a\u00020\t8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010>R\u0014\u0010C\u001a\u00020\t8\u0016X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008B\u0010>\u00a8\u0006D"
    }
    d2 = {
        "Lexpo/modules/kotlin/typedarray/Int8Array;",
        "Lexpo/modules/kotlin/typedarray/TypedArray;",
        "Lexpo/modules/kotlin/typedarray/GenericTypedArray;",
        "",
        "Lexpo/modules/kotlin/typedarray/RawTypedArrayHolder;",
        "Lexpo/modules/kotlin/jni/JavaScriptTypedArray;",
        "rawArray",
        "<init>",
        "(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V",
        "",
        "index",
        "get",
        "(I)Ljava/lang/Byte;",
        "value",
        "Li7/B;",
        "set",
        "(IB)V",
        "Ljava/nio/ByteBuffer;",
        "toDirectBuffer",
        "()Ljava/nio/ByteBuffer;",
        "",
        "buffer",
        "position",
        "size",
        "read",
        "([BII)V",
        "write",
        "readByte",
        "(I)B",
        "",
        "read2Byte",
        "(I)S",
        "read4Byte",
        "(I)I",
        "",
        "read8Byte",
        "(I)J",
        "",
        "readFloat",
        "(I)F",
        "",
        "readDouble",
        "(I)D",
        "writeByte",
        "write2Byte",
        "(IS)V",
        "write4Byte",
        "(II)V",
        "write8Byte",
        "(IJ)V",
        "writeFloat",
        "(IF)V",
        "writeDouble",
        "(ID)V",
        "Lexpo/modules/kotlin/jni/JavaScriptTypedArray;",
        "getRawArray",
        "()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;",
        "Lexpo/modules/kotlin/jni/TypedArrayKind;",
        "getKind",
        "()Lexpo/modules/kotlin/jni/TypedArrayKind;",
        "kind",
        "getLength",
        "()I",
        "length",
        "getByteLength",
        "byteLength",
        "getByteOffset",
        "byteOffset",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V
    .locals 1

    .line 1
    const-string v0, "rawArray"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Byte;
    .locals 1

    if-ltz p1, :cond_0

    .line 2
    invoke-interface {p0}, Lexpo/modules/kotlin/typedarray/TypedArray;->getLength()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/typedarray/Int8Array;->readByte(I)B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lexpo/modules/kotlin/typedarray/Int8Array;->get(I)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public getByteLength()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->getByteLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getByteOffset()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->getByteOffset()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getKind()Lexpo/modules/kotlin/jni/TypedArrayKind;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->getKind()Lexpo/modules/kotlin/jni/TypedArrayKind;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getLength()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->getLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getRawArray()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Byte;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/typedarray/GenericTypedArray$DefaultImpls;->iterator(Lexpo/modules/kotlin/typedarray/GenericTypedArray;)Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public read([BII)V
    .locals 1

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->read([BII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public read2Byte(I)S
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->read2Byte(I)S

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public read4Byte(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->read4Byte(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public read8Byte(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->read8Byte(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public readByte(I)B
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->readByte(I)B

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public readDouble(I)D
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->readDouble(I)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public readFloat(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->readFloat(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public set(IB)V
    .locals 1

    if-ltz p1, :cond_0

    .line 2
    invoke-interface {p0}, Lexpo/modules/kotlin/typedarray/TypedArray;->getLength()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 3
    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/typedarray/Int8Array;->writeByte(IB)V

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public bridge synthetic set(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    move-result p2

    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/typedarray/Int8Array;->set(IB)V

    return-void
.end method

.method public toDirectBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->toDirectBuffer()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public write([BII)V
    .locals 1

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->write([BII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public write2Byte(IS)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->write2Byte(IS)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public write4Byte(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->write4Byte(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public write8Byte(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->write8Byte(IJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeByte(IB)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->writeByte(IB)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeDouble(ID)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->writeDouble(ID)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public writeFloat(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/typedarray/Int8Array;->rawArray:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->writeFloat(IF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
