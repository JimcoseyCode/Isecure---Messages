.class abstract LW3/k$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:LW3/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LW3/k;

    .line 2
    .line 3
    invoke-direct {v0}, LW3/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LW3/k$a;->a:LW3/k;

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a()LW3/k;
    .locals 1

    .line 1
    sget-object v0, LW3/k$a;->a:LW3/k;

    .line 2
    .line 3
    return-object v0
.end method
