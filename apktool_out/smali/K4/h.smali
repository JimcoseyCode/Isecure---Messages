.class public abstract LK4/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:LK4/e;

.field private static volatile b:LK4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK4/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK4/g;-><init>(LK4/f;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK4/h;->a:LK4/e;

    .line 8
    .line 9
    sput-object v0, LK4/h;->b:LK4/e;

    .line 10
    .line 11
    return-void
.end method

.method public static a()LK4/e;
    .locals 1

    .line 1
    sget-object v0, LK4/h;->b:LK4/e;

    .line 2
    .line 3
    return-object v0
.end method
