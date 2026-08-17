.class final Lr/V$f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/c0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lr/V;


# direct methods
.method constructor <init>(Lr/V;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/V$f;->a:Lr/V;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lr/V$f;->a:Lr/V;

    .line 2
    .line 3
    iget-object v0, v0, Lr/V;->k:Lr/V$i;

    .line 4
    .line 5
    sget-object v1, Lr/V$i;->p:Lr/V$i;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lr/V$f;->a:Lr/V;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr/V;->v0()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
