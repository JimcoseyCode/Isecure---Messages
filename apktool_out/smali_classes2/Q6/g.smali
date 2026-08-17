.class public final LQ6/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LQ6/h;


# static fields
.field public static final a:LQ6/g;

.field private static b:LQ6/h;

.field private static final c:LQ6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQ6/g;

    .line 2
    .line 3
    invoke-direct {v0}, LQ6/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ6/g;->a:LQ6/g;

    .line 7
    .line 8
    new-instance v0, LQ6/d;

    .line 9
    .line 10
    invoke-direct {v0}, LQ6/d;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LQ6/g;->c:LQ6/h;

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
.method public a()I
    .locals 1

    .line 1
    sget-object v0, LQ6/g;->b:LQ6/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LQ6/h;->a()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    sget-object v0, LQ6/g;->c:LQ6/h;

    .line 11
    .line 12
    invoke-interface {v0}, LQ6/h;->a()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method
