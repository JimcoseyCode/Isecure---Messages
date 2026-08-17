.class public final LD8/f$a;
.super LD8/f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LD8/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD8/f$a;

    .line 2
    .line 3
    invoke-direct {v0}, LD8/f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD8/f$a;->a:LD8/f$a;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LD8/f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
