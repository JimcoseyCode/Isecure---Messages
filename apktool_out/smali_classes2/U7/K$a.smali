.class public final LU7/K$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU7/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LU7/K$a;

.field private static final b:LU7/K;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LU7/K$a;

    .line 2
    .line 3
    invoke-direct {v0}, LU7/K$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU7/K$a;->a:LU7/K$a;

    .line 7
    .line 8
    new-instance v0, LU7/M;

    .line 9
    .line 10
    invoke-static {}, Lj7/K;->i()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, LU7/M;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LU7/K$a;->b:LU7/K;

    .line 18
    .line 19
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
.method public final a()LU7/K;
    .locals 1

    .line 1
    sget-object v0, LU7/K$a;->b:LU7/K;

    .line 2
    .line 3
    return-object v0
.end method
