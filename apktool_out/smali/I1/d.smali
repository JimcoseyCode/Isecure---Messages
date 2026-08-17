.class public LI1/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LI1/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public transcode(Lx1/v;Lv1/h;)Lx1/v;
    .locals 0

    .line 1
    invoke-interface {p1}, Lx1/v;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LH1/c;

    .line 6
    .line 7
    invoke-virtual {p1}, LH1/c;->c()Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance p2, LE1/b;

    .line 12
    .line 13
    invoke-static {p1}, LQ1/a;->e(Ljava/nio/ByteBuffer;)[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p2, p1}, LE1/b;-><init>([B)V

    .line 18
    .line 19
    .line 20
    return-object p2
.end method
