.class public final synthetic Lcom/facebook/react/modules/statusbar/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/statusbar/a;->g:Landroid/app/Activity;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/facebook/react/modules/statusbar/a;->h:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/statusbar/a;->g:Landroid/app/Activity;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/facebook/react/modules/statusbar/a;->h:Z

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/react/modules/statusbar/StatusBarModule;->a(Landroid/app/Activity;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
