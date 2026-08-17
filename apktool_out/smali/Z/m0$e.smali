.class public final LZ/m0$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final a:LF/p1;

.field private static final b:LZ/x0;

.field private static final c:La0/a;

.field private static final d:Lg0/s0$a;

.field static final e:Landroid/util/Range;

.field static final f:Landroid/util/Range;

.field static final g:Ly/H;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, LF/p1;->j:LF/p1;

    .line 2
    .line 3
    sput-object v0, LZ/m0$e;->a:LF/p1;

    .line 4
    .line 5
    new-instance v1, LZ/o0;

    .line 6
    .line 7
    invoke-direct {v1}, LZ/o0;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v1, LZ/m0$e;->b:LZ/x0;

    .line 11
    .line 12
    sget-object v2, Lg0/u0;->d:Lg0/s0$a;

    .line 13
    .line 14
    sput-object v2, LZ/m0$e;->d:Lg0/s0$a;

    .line 15
    .line 16
    new-instance v3, Landroid/util/Range;

    .line 17
    .line 18
    const/16 v4, 0x1e

    .line 19
    .line 20
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-direct {v3, v4, v4}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 25
    .line 26
    .line 27
    sput-object v3, LZ/m0$e;->e:Landroid/util/Range;

    .line 28
    .line 29
    new-instance v3, Landroid/util/Range;

    .line 30
    .line 31
    const/16 v4, 0x78

    .line 32
    .line 33
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-direct {v3, v4, v4}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 38
    .line 39
    .line 40
    sput-object v3, LZ/m0$e;->f:Landroid/util/Range;

    .line 41
    .line 42
    sget-object v3, Ly/H;->d:Ly/H;

    .line 43
    .line 44
    sput-object v3, LZ/m0$e;->g:Ly/H;

    .line 45
    .line 46
    new-instance v4, LZ/m0$d;

    .line 47
    .line 48
    invoke-direct {v4, v1}, LZ/m0$d;-><init>(LZ/x0;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x5

    .line 52
    invoke-virtual {v4, v1}, LZ/m0$d;->m(I)LZ/m0$d;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1, v0}, LZ/m0$d;->l(LF/p1;)LZ/m0$d;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0, v2}, LZ/m0$d;->r(Lg0/s0$a;)LZ/m0$d;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0, v3}, LZ/m0$d;->j(Ly/H;)LZ/m0$d;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, LZ/m0$d;->h()La0/a;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, LZ/m0$e;->c:La0/a;

    .line 73
    .line 74
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
.method public a()La0/a;
    .locals 1

    .line 1
    sget-object v0, LZ/m0$e;->c:La0/a;

    .line 2
    .line 3
    return-object v0
.end method
