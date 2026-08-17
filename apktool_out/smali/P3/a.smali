.class public abstract LP3/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP3/b;


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
.method public a()Lcom/github/penfeizhou/animation/io/Reader;
    .locals 2

    .line 1
    new-instance v0, Lcom/github/penfeizhou/animation/io/a;

    .line 2
    .line 3
    invoke-virtual {p0}, LP3/a;->b()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public abstract b()Ljava/nio/ByteBuffer;
.end method
