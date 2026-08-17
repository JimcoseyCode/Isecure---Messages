.class public abstract LJ5/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ5/b$b;
    }
.end annotation


# static fields
.field private static final a:LJ5/a;

.field private static volatile b:LJ5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ5/b$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJ5/b$b;-><init>(LJ5/b$a;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ5/b;->a:LJ5/a;

    .line 8
    .line 9
    sput-object v0, LJ5/b;->b:LJ5/a;

    .line 10
    .line 11
    return-void
.end method

.method public static a()LJ5/a;
    .locals 1

    .line 1
    sget-object v0, LJ5/b;->b:LJ5/a;

    .line 2
    .line 3
    return-object v0
.end method
