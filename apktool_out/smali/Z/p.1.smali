.class public abstract LZ/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/p$b;
    }
.end annotation


# static fields
.field static final a:LZ/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LZ/e;

    .line 2
    .line 3
    sget-object v1, LZ/v;->g:LZ/v;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LZ/e;-><init>(LZ/v;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LZ/p;->a:LZ/p;

    .line 10
    .line 11
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LZ/p$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LZ/p;-><init>()V

    return-void
.end method

.method public static a(LZ/v;)LZ/p;
    .locals 2

    .line 1
    new-instance v0, LZ/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, LZ/e;-><init>(LZ/v;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
