.class public abstract LA/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA/b$a;,
        LA/b$b;
    }
.end annotation


# static fields
.field public static final b:LA/b$a;

.field public static final c:LA/b;

.field public static final d:LA/b;

.field public static final e:LA/b;

.field public static final f:LA/b;


# instance fields
.field private final a:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LA/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LA/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LA/b;->b:LA/b$a;

    .line 8
    .line 9
    new-instance v0, LC/a;

    .line 10
    .line 11
    sget-object v1, Ly/H;->f:Ly/H;

    .line 12
    .line 13
    const-string v2, "HLG_10_BIT"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, LC/a;-><init>(Ly/H;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LA/b;->c:LA/b;

    .line 22
    .line 23
    new-instance v0, LC/c;

    .line 24
    .line 25
    const/16 v1, 0x3c

    .line 26
    .line 27
    invoke-direct {v0, v1, v1}, LC/c;-><init>(II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, LA/b;->d:LA/b;

    .line 31
    .line 32
    new-instance v0, LC/e;

    .line 33
    .line 34
    sget-object v1, LC/e$b;->i:LC/e$b;

    .line 35
    .line 36
    invoke-direct {v0, v1}, LC/e;-><init>(LC/e$b;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LA/b;->e:LA/b;

    .line 40
    .line 41
    new-instance v0, LC/d;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-direct {v0, v1}, LC/d;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LA/b;->f:LA/b;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LA/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LA/a;-><init>(LA/b;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LA/b;->a:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(LA/b;)I
    .locals 0

    .line 1
    invoke-static {p0}, LA/b;->b(LA/b;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final b(LA/b;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LA/b;->c()LC/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, LA/b;->e(LC/b;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private final e(LC/b;)I
    .locals 2

    .line 1
    sget-object v0, LA/b$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-ne p1, v1, :cond_0

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    new-instance p1, Li7/m;

    .line 23
    .line 24
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    return v1

    .line 29
    :cond_2
    return v0

    .line 30
    :cond_3
    const/4 p1, 0x0

    .line 31
    return p1
.end method


# virtual methods
.method public abstract c()LC/b;
.end method

.method public d(LF/L;Ly/v0;)Z
    .locals 1

    .line 1
    const-string v0, "cameraInfoInternal"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "sessionConfig"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method
