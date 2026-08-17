.class public final Ly/V$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/V;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field private static final a:LF/p1;

.field private static final b:LS/c;

.field private static final c:LF/C0;

.field private static final d:Ly/H;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, LF/p1;->k:LF/p1;

    .line 2
    .line 3
    sput-object v0, Ly/V$c;->a:LF/p1;

    .line 4
    .line 5
    new-instance v1, LS/c$a;

    .line 6
    .line 7
    invoke-direct {v1}, LS/c$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, LS/a;->c:LS/a;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, LS/c$a;->d(LS/a;)LS/c$a;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, LS/d;->c:LS/d;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, LS/c$a;->f(LS/d;)LS/c$a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, LS/c$a;->a()LS/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sput-object v1, Ly/V$c;->b:LS/c;

    .line 27
    .line 28
    sget-object v2, Ly/H;->d:Ly/H;

    .line 29
    .line 30
    sput-object v2, Ly/V$c;->d:Ly/H;

    .line 31
    .line 32
    new-instance v3, Ly/V$b;

    .line 33
    .line 34
    invoke-direct {v3}, Ly/V$b;-><init>()V

    .line 35
    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    invoke-virtual {v3, v4}, Ly/V$b;->o(I)Ly/V$b;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3, v0}, Ly/V$b;->n(LF/p1;)Ly/V$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v0, v3}, Ly/V$b;->p(I)Ly/V$b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0, v1}, Ly/V$b;->l(LS/c;)Ly/V$b;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, v3}, Ly/V$b;->k(I)Ly/V$b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, v2}, Ly/V$b;->i(Ly/H;)Ly/V$b;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ly/V$b;->g()LF/C0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Ly/V$c;->c:LF/C0;

    .line 68
    .line 69
    return-void
.end method

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
.method public a()LF/C0;
    .locals 1

    .line 1
    sget-object v0, Ly/V$c;->c:LF/C0;

    .line 2
    .line 3
    return-object v0
.end method
