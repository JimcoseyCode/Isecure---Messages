.class public Lcom/facebook/imagepipeline/memory/AshmemMemoryChunkPool;
.super Lcom/facebook/imagepipeline/memory/f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>(Lf2/d;Lg3/E;Lg3/F;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/memory/f;-><init>(Lf2/d;Lg3/E;Lg3/F;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public E(I)Lg3/f;
    .locals 1

    .line 1
    new-instance v0, Lg3/f;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lg3/f;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic g(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/AshmemMemoryChunkPool;->E(I)Lg3/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
