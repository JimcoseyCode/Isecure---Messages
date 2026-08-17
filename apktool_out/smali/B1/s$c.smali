.class public LB1/s$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB1/s$c;->a:Landroid/content/res/Resources;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public build(LB1/r;)LB1/n;
    .locals 2

    .line 1
    new-instance p1, LB1/s;

    .line 2
    .line 3
    iget-object v0, p0, LB1/s$c;->a:Landroid/content/res/Resources;

    .line 4
    .line 5
    invoke-static {}, LB1/w;->a()LB1/w;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {p1, v0, v1}, LB1/s;-><init>(Landroid/content/res/Resources;LB1/n;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
