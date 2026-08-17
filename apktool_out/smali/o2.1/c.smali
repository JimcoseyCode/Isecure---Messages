.class public final Lo2/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:Lo2/c;

.field private static b:Lo2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lo2/c;

    .line 2
    .line 3
    invoke-direct {v0}, Lo2/c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lo2/c;->a:Lo2/c;

    .line 7
    .line 8
    sget-object v0, Lo2/a;->a:Lo2/a;

    .line 9
    .line 10
    sput-object v0, Lo2/c;->b:Lo2/b;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a()Lo2/b;
    .locals 1

    .line 1
    sget-object v0, Lo2/c;->b:Lo2/b;

    .line 2
    .line 3
    return-object v0
.end method
