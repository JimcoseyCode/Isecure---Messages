.class public final LZ2/a$a;
.super Lcom/facebook/imagepipeline/producers/c;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ2/a;->y()Lcom/facebook/imagepipeline/producers/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LZ2/a;


# direct methods
.method constructor <init>(LZ2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ2/a$a;->b:LZ2/a;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method protected f()V
    .locals 1

    .line 1
    iget-object v0, p0, LZ2/a$a;->b:LZ2/a;

    .line 2
    .line 3
    invoke-static {v0}, LZ2/a;->v(LZ2/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected g(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "throwable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ2/a$a;->b:LZ2/a;

    .line 7
    .line 8
    invoke-static {v0, p1}, LZ2/a;->w(LZ2/a;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method protected h(Ljava/lang/Object;I)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ2/a$a;->b:LZ2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ2/a;->A()Lcom/facebook/imagepipeline/producers/l0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, p1, p2, v1}, LZ2/a;->D(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method protected i(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ2/a$a;->b:LZ2/a;

    .line 2
    .line 3
    invoke-static {v0, p1}, LZ2/a;->x(LZ2/a;F)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
