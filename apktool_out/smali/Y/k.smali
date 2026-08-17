.class public final LY/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/k$a;
    }
.end annotation


# static fields
.field public static final b:LY/k$a;

.field private static final c:LY/k;


# instance fields
.field private final a:LY/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY/k;->b:LY/k$a;

    .line 8
    .line 9
    new-instance v0, LY/k;

    .line 10
    .line 11
    new-instance v1, LY/g;

    .line 12
    .line 13
    invoke-direct {v1}, LY/g;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, LY/k;-><init>(LY/g;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LY/k;->c:LY/k;

    .line 20
    .line 21
    return-void
.end method

.method private constructor <init>(LY/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY/k;->a:LY/g;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic b()LY/k;
    .locals 1

    .line 1
    sget-object v0, LY/k;->c:LY/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c(LY/k;Landroid/content/Context;)Lm5/a;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LY/k;->e(Landroid/content/Context;)Lm5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final e(Landroid/content/Context;)Lm5/a;
    .locals 2

    .line 1
    iget-object v0, p0, LY/k;->a:LY/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, LY/g;->v(Landroid/content/Context;Ly/D;)Lm5/a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, LY/k;->a:LY/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d(Landroidx/lifecycle/r;Ly/s;Ly/K0;)Ly/i;
    .locals 1

    .line 1
    const-string v0, "lifecycleOwner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraSelector"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "useCaseGroup"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LY/k;->a:LY/g;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2, p3}, LY/g;->n(Landroidx/lifecycle/r;Ly/s;Ly/K0;)Ly/i;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, LY/k;->a:LY/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/g;->E()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
