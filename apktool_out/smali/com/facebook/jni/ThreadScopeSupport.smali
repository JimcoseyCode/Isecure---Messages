.class public Lcom/facebook/jni/ThreadScopeSupport;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "fbjni"

    .line 2
    .line 3
    invoke-static {v0}, Ly3/a;->d(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static runStdFunction(J)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/jni/ThreadScopeSupport;->runStdFunctionImpl(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static native runStdFunctionImpl(J)V
.end method
