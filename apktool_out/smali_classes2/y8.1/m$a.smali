.class public final Ly8/m$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ly8/m$a;

.field private static final b:Ly8/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly8/m$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly8/m$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly8/m$a;->a:Ly8/m$a;

    .line 7
    .line 8
    new-instance v0, Ly8/m$a$a;

    .line 9
    .line 10
    invoke-direct {v0}, Ly8/m$a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ly8/m$a;->b:Ly8/m;

    .line 14
    .line 15
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
.method public final a()Ly8/m;
    .locals 1

    .line 1
    sget-object v0, Ly8/m$a;->b:Ly8/m;

    .line 2
    .line 3
    return-object v0
.end method
