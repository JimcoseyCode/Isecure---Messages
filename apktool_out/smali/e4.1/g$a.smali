.class abstract Le4/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final a:Le4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le4/g;

    .line 2
    .line 3
    invoke-direct {v0}, Le4/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le4/g$a;->a:Le4/g;

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a()Le4/g;
    .locals 1

    .line 1
    sget-object v0, Le4/g$a;->a:Le4/g;

    .line 2
    .line 3
    return-object v0
.end method
