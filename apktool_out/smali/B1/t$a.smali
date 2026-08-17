.class final LB1/t$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB1/t$a;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public build(LB1/r;)LB1/n;
    .locals 4

    .line 1
    new-instance v0, LB1/t;

    .line 2
    .line 3
    iget-object v1, p0, LB1/t$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Integer;

    .line 6
    .line 7
    const-class v3, Landroid/content/res/AssetFileDescriptor;

    .line 8
    .line 9
    invoke-virtual {p1, v2, v3}, LB1/r;->d(Ljava/lang/Class;Ljava/lang/Class;)LB1/n;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v0, v1, p1}, LB1/t;-><init>(Landroid/content/Context;LB1/n;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
