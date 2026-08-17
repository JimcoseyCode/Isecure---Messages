.class public final Lj8/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:Lj8/c;

.field private static final b:Lh8/b$b;

.field private static final c:Lh8/b$b;

.field private static final d:Lh8/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj8/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lj8/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lj8/c;->a:Lj8/c;

    .line 7
    .line 8
    invoke-static {}, Lh8/b$d;->c()Lh8/b$b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lj8/c;->b:Lh8/b$b;

    .line 13
    .line 14
    invoke-static {}, Lh8/b$d;->c()Lh8/b$b;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lj8/c;->c:Lh8/b$b;

    .line 19
    .line 20
    invoke-static {v0}, Lh8/b$d;->b(Lh8/b$d;)Lh8/b$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lj8/c;->d:Lh8/b$b;

    .line 25
    .line 26
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lh8/b$b;
    .locals 1

    .line 1
    sget-object v0, Lj8/c;->b:Lh8/b$b;

    .line 2
    .line 3
    return-object v0
.end method
