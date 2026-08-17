.class public final LD/b$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LD/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LD/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LD/b$b;

    .line 2
    .line 3
    invoke-direct {v0}, LD/b$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LD/b$b;->a:LD/b$b;

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
