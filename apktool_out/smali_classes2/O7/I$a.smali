.class public final LO7/I$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO7/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LO7/I$a;

.field private static final b:LL7/G;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LO7/I$a;

    .line 2
    .line 3
    invoke-direct {v0}, LO7/I$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LO7/I$a;->a:LO7/I$a;

    .line 7
    .line 8
    new-instance v0, LL7/G;

    .line 9
    .line 10
    const-string v1, "PackageViewDescriptorFactory"

    .line 11
    .line 12
    invoke-direct {v0, v1}, LL7/G;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LO7/I$a;->b:LL7/G;

    .line 16
    .line 17
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


# virtual methods
.method public final a()LL7/G;
    .locals 1

    .line 1
    sget-object v0, LO7/I$a;->b:LL7/G;

    .line 2
    .line 3
    return-object v0
.end method
