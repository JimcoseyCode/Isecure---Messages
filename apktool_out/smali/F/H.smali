.class public abstract LF/H;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/H$a;
    }
.end annotation


# static fields
.field private static final a:LF/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LF/H$a;

    .line 2
    .line 3
    invoke-direct {v0}, LF/H$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF/H;->a:LF/E;

    .line 7
    .line 8
    return-void
.end method

.method public static a()LF/E;
    .locals 1

    .line 1
    sget-object v0, LF/H;->a:LF/E;

    .line 2
    .line 3
    return-object v0
.end method
