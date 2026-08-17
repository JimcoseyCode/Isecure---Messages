.class public final Landroidx/activity/q$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/q;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Landroidx/activity/q;


# direct methods
.method constructor <init>(Landroidx/activity/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/q$a;->g:Landroidx/activity/q;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public k(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "event"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/activity/q$a;->g:Landroidx/activity/q;

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/activity/q;->access$ensureViewModelStore(Landroidx/activity/q;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Landroidx/activity/q$a;->g:Landroidx/activity/q;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/activity/q;->getLifecycle()Landroidx/lifecycle/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->d(Landroidx/lifecycle/q;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
