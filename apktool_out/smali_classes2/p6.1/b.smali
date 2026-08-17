.class public final Lp6/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:Lp6/b;

.field private static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp6/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lp6/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp6/b;->a:Lp6/b;

    .line 7
    .line 8
    const-wide v0, 0x4030aaaaaaaaaaabL    # 16.666666666666668

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    double-to-long v0, v0

    .line 18
    sput-wide v0, Lp6/b;->b:J

    .line 19
    .line 20
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
.method public final a()J
    .locals 2

    .line 1
    sget-wide v0, Lp6/b;->b:J

    .line 2
    .line 3
    return-wide v0
.end method
