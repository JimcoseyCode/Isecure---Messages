.class public final LD1/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv1/l;


# static fields
.field private static final b:Lv1/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD1/n;

    .line 2
    .line 3
    invoke-direct {v0}, LD1/n;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD1/n;->b:Lv1/l;

    .line 7
    .line 8
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

.method public static b()LD1/n;
    .locals 1

    .line 1
    sget-object v0, LD1/n;->b:Lv1/l;

    .line 2
    .line 3
    check-cast v0, LD1/n;

    .line 4
    .line 5
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lx1/v;II)Lx1/v;
    .locals 0

    .line 1
    return-object p2
.end method

.method public updateDiskCacheKey(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method
