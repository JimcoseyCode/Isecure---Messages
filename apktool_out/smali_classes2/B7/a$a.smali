.class public final LB7/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LB7/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)LB7/a;
    .locals 1

    .line 1
    new-instance v0, LB7/a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, LB7/a;-><init>(III)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
