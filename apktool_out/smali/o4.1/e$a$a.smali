.class public Lo4/e$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/e$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lp4/j;

.field private b:Landroid/os/Looper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lo4/e$a;
    .locals 4

    .line 1
    iget-object v0, p0, Lo4/e$a$a;->a:Lp4/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lp4/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lp4/a;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo4/e$a$a;->a:Lp4/j;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo4/e$a$a;->b:Landroid/os/Looper;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lo4/e$a$a;->b:Landroid/os/Looper;

    .line 21
    .line 22
    :cond_1
    new-instance v0, Lo4/e$a;

    .line 23
    .line 24
    iget-object v1, p0, Lo4/e$a$a;->a:Lp4/j;

    .line 25
    .line 26
    iget-object v2, p0, Lo4/e$a$a;->b:Landroid/os/Looper;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v0, v1, v3, v2, v3}, Lo4/e$a;-><init>(Lp4/j;Landroid/accounts/Account;Landroid/os/Looper;Lo4/k;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
