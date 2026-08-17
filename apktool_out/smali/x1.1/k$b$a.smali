.class Lx1/k$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LR1/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lx1/k$b;


# direct methods
.method constructor <init>(Lx1/k$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/k$b$a;->a:Lx1/k$b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lx1/l;
    .locals 8

    .line 1
    new-instance v0, Lx1/l;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/k$b$a;->a:Lx1/k$b;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v2, Lx1/k$b;->a:LA1/a;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, v3, Lx1/k$b;->b:LA1/a;

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v4, Lx1/k$b;->c:LA1/a;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v5, Lx1/k$b;->d:LA1/a;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v6, Lx1/k$b;->e:Lx1/m;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v7, Lx1/k$b;->f:Lx1/p$a;

    .line 22
    .line 23
    iget-object v7, v7, Lx1/k$b;->g:LH0/e;

    .line 24
    .line 25
    invoke-direct/range {v0 .. v7}, Lx1/l;-><init>(LA1/a;LA1/a;LA1/a;LA1/a;Lx1/m;Lx1/p$a;LH0/e;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx1/k$b$a;->a()Lx1/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
