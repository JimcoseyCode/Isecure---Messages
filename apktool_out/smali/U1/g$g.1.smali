.class LU1/g$g;
.super LU1/g$O;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation


# static fields
.field private static g:LU1/g$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU1/g$g;

    .line 2
    .line 3
    invoke-direct {v0}, LU1/g$g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU1/g$g;->g:LU1/g$g;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LU1/g$O;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static a()LU1/g$g;
    .locals 1

    .line 1
    sget-object v0, LU1/g$g;->g:LU1/g$g;

    .line 2
    .line 3
    return-object v0
.end method
