.class public LB1/w$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final a:LB1/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LB1/w$a;

    .line 2
    .line 3
    invoke-direct {v0}, LB1/w$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LB1/w$a;->a:LB1/w$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()LB1/w$a;
    .locals 1

    .line 1
    sget-object v0, LB1/w$a;->a:LB1/w$a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public build(LB1/r;)LB1/n;
    .locals 0

    .line 1
    invoke-static {}, LB1/w;->a()LB1/w;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
