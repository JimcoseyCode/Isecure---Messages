.class public final synthetic Ly6/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Ly6/g;

.field public final synthetic i:Landroid/view/View;

.field public final synthetic j:Landroid/app/Activity;

.field public final synthetic k:Z


# direct methods
.method public synthetic constructor <init>(ZLy6/g;Landroid/view/View;Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ly6/a;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Ly6/a;->h:Ly6/g;

    .line 7
    .line 8
    iput-object p3, p0, Ly6/a;->i:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, Ly6/a;->j:Landroid/app/Activity;

    .line 11
    .line 12
    iput-boolean p5, p0, Ly6/a;->k:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ly6/a;->g:Z

    .line 2
    .line 3
    iget-object v1, p0, Ly6/a;->h:Ly6/g;

    .line 4
    .line 5
    iget-object v2, p0, Ly6/a;->i:Landroid/view/View;

    .line 6
    .line 7
    iget-object v3, p0, Ly6/a;->j:Landroid/app/Activity;

    .line 8
    .line 9
    iget-boolean v4, p0, Ly6/a;->k:Z

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Ly6/g;->d(ZLy6/g;Landroid/view/View;Landroid/app/Activity;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
