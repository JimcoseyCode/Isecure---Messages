.class public final LP7/c;
.super LL7/x0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final c:LP7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LP7/c;

    .line 2
    .line 3
    invoke-direct {v0}, LP7/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP7/c;->c:LP7/c;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "protected_static"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v0, v1}, LL7/x0;-><init>(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "protected/*protected static*/"

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LL7/x0;
    .locals 1

    .line 1
    sget-object v0, LL7/w0$g;->c:LL7/w0$g;

    .line 2
    .line 3
    return-object v0
.end method
