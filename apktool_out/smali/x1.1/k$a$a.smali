.class Lx1/k$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LR1/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/k$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx1/k$a;


# direct methods
.method constructor <init>(Lx1/k$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/k$a$a;->a:Lx1/k$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lx1/h;
    .locals 3

    .line 1
    new-instance v0, Lx1/h;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/k$a$a;->a:Lx1/k$a;

    .line 4
    .line 5
    iget-object v2, v1, Lx1/k$a;->a:Lx1/h$e;

    .line 6
    .line 7
    iget-object v1, v1, Lx1/k$a;->b:LH0/e;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lx1/h;-><init>(Lx1/h$e;LH0/e;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/k$a$a;->a()Lx1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
