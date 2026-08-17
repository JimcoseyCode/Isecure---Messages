.class public final LY2/x$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY2/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public A:Z

.field public B:Z

.field public C:I

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:I

.field public J:Z

.field public K:Z

.field public L:Lh3/f;

.field public M:Z

.field private final a:LY2/u$a;

.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Ll2/b;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:I

.field public n:Z

.field public o:Z

.field public p:LY2/x$d;

.field public q:Lc2/n;

.field public r:Z

.field public s:Z

.field public t:Lc2/n;

.field public u:Z

.field public v:J

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(LY2/u$a;)V
    .locals 3

    .line 1
    const-string v0, "configBuilder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LY2/x$a;->a:LY2/u$a;

    .line 10
    .line 11
    const/16 p1, 0x3e8

    .line 12
    .line 13
    iput p1, p0, LY2/x$a;->i:I

    .line 14
    .line 15
    const/16 p1, 0x800

    .line 16
    .line 17
    iput p1, p0, LY2/x$a;->m:I

    .line 18
    .line 19
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-static {p1}, Lc2/o;->a(Ljava/lang/Object;)Lc2/n;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "of(...)"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LY2/x$a;->t:Lc2/n;

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    iput-boolean p1, p0, LY2/x$a;->y:Z

    .line 34
    .line 35
    iput-boolean p1, p0, LY2/x$a;->z:Z

    .line 36
    .line 37
    const/16 p1, 0x14

    .line 38
    .line 39
    iput p1, p0, LY2/x$a;->C:I

    .line 40
    .line 41
    const/16 p1, 0x1e

    .line 42
    .line 43
    iput p1, p0, LY2/x$a;->I:I

    .line 44
    .line 45
    new-instance p1, Lh3/f;

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    const/4 v1, 0x0

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {p1, v2, v2, v0, v1}, Lh3/f;-><init>(ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, LY2/x$a;->L:Lh3/f;

    .line 54
    .line 55
    return-void
.end method

.method public static synthetic a(LY2/x$a;Z)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY2/x$a;->e(LY2/x$a;Z)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(Lw7/a;)LY2/x$a;
    .locals 0

    .line 1
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-object p0
.end method

.method private static final e(LY2/x$a;Z)Li7/B;
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p1, p0, LY2/x$a;->M:Z

    .line 7
    .line 8
    sget-object p0, Li7/B;->a:Li7/B;

    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public final c()LY2/x;
    .locals 2

    .line 1
    new-instance v0, LY2/x;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LY2/x;-><init>(LY2/x$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final d(Z)LY2/x$a;
    .locals 1

    .line 1
    new-instance v0, LY2/w;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LY2/w;-><init>(LY2/x$a;Z)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, LY2/x$a;->b(Lw7/a;)LY2/x$a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
