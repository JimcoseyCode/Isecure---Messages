.class final LF1/h$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv1/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:LF1/h;


# direct methods
.method constructor <init>(LF1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF1/h$c;->a:LF1/h;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;IILv1/h;)Lx1/v;
    .locals 1

    .line 1
    invoke-static {p1}, LQ1/a;->b(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/bumptech/glide/load/resource/bitmap/j;->a(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, LF1/h$c;->a:LF1/h;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, LF1/h;->b(Landroid/graphics/ImageDecoder$Source;IILv1/h;)Lx1/v;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public b(Ljava/io/InputStream;Lv1/h;)Z
    .locals 0

    .line 1
    iget-object p2, p0, LF1/h$c;->a:LF1/h;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, LF1/h;->c(Ljava/io/InputStream;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic decode(Ljava/lang/Object;IILv1/h;)Lx1/v;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LF1/h$c;->a(Ljava/io/InputStream;IILv1/h;)Lx1/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic handles(Ljava/lang/Object;Lv1/h;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LF1/h$c;->b(Ljava/io/InputStream;Lv1/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
