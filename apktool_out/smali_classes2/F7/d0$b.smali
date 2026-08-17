.class public abstract LF7/d0$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF7/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "b"
.end annotation


# static fields
.field static final synthetic c:[LC7/k;


# instance fields
.field private final a:LF7/a1$a;

.field final synthetic b:LF7/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LF7/d0$b;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "moduleData"

    .line 10
    .line 11
    const-string v3, "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/v;-><init>(LC7/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x1

    .line 21
    new-array v1, v1, [LC7/k;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    sput-object v1, LF7/d0$b;->c:[LC7/k;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(LF7/d0;)V
    .locals 1

    .line 1
    iput-object p1, p0, LF7/d0$b;->b:LF7/d0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LF7/e0;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LF7/e0;-><init>(LF7/d0;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LF7/a1;->c(Lw7/a;)LF7/a1$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, LF7/d0$b;->a:LF7/a1$a;

    .line 16
    .line 17
    return-void
.end method

.method static synthetic a(LF7/d0;)LQ7/k;
    .locals 0

    .line 1
    invoke-static {p0}, LF7/d0$b;->c(LF7/d0;)LQ7/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(LF7/d0;)LQ7/k;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/internal/d;->b()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LF7/Z0;->a(Ljava/lang/Class;)LQ7/k;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public final b()LQ7/k;
    .locals 3

    .line 1
    iget-object v0, p0, LF7/d0$b;->a:LF7/a1$a;

    .line 2
    .line 3
    sget-object v1, LF7/d0$b;->c:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LF7/a1$b;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getValue(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast v0, LQ7/k;

    .line 18
    .line 19
    return-object v0
.end method
