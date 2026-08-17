.class public abstract LQ1/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:Ljava/util/concurrent/Executor;

.field private static final b:Ljava/util/concurrent/Executor;

.field private static final c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQ1/e$a;

    .line 2
    .line 3
    invoke-direct {v0}, LQ1/e$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ1/e;->a:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v0, LQ1/e$b;

    .line 9
    .line 10
    invoke-direct {v0}, LQ1/e$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LQ1/e;->b:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    new-instance v0, LQ1/e$c;

    .line 16
    .line 17
    invoke-direct {v0}, LQ1/e$c;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, LQ1/e;->c:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    return-void
.end method

.method public static a()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    sget-object v0, LQ1/e;->c:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object v0
.end method

.method public static b()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    sget-object v0, LQ1/e;->a:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object v0
.end method
