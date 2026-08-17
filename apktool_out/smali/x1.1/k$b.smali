.class Lx1/k$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final a:LA1/a;

.field final b:LA1/a;

.field final c:LA1/a;

.field final d:LA1/a;

.field final e:Lx1/m;

.field final f:Lx1/p$a;

.field final g:LH0/e;


# direct methods
.method constructor <init>(LA1/a;LA1/a;LA1/a;LA1/a;Lx1/m;Lx1/p$a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx1/k$b$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lx1/k$b$a;-><init>(Lx1/k$b;)V

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x96

    .line 10
    .line 11
    invoke-static {v1, v0}, LR1/a;->d(ILR1/a$d;)LH0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lx1/k$b;->g:LH0/e;

    .line 16
    .line 17
    iput-object p1, p0, Lx1/k$b;->a:LA1/a;

    .line 18
    .line 19
    iput-object p2, p0, Lx1/k$b;->b:LA1/a;

    .line 20
    .line 21
    iput-object p3, p0, Lx1/k$b;->c:LA1/a;

    .line 22
    .line 23
    iput-object p4, p0, Lx1/k$b;->d:LA1/a;

    .line 24
    .line 25
    iput-object p5, p0, Lx1/k$b;->e:Lx1/m;

    .line 26
    .line 27
    iput-object p6, p0, Lx1/k$b;->f:Lx1/p$a;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method a(Lv1/f;ZZZZ)Lx1/l;
    .locals 7

    .line 1
    iget-object v0, p0, Lx1/k$b;->g:LH0/e;

    .line 2
    .line 3
    invoke-interface {v0}, LH0/e;->acquire()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx1/l;

    .line 8
    .line 9
    invoke-static {v0}, LQ1/k;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Lx1/l;

    .line 15
    .line 16
    move-object v2, p1

    .line 17
    move v3, p2

    .line 18
    move v4, p3

    .line 19
    move v5, p4

    .line 20
    move v6, p5

    .line 21
    invoke-virtual/range {v1 .. v6}, Lx1/l;->k(Lv1/f;ZZZZ)Lx1/l;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
