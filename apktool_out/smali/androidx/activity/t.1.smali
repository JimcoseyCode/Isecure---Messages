.class public final synthetic Landroidx/activity/t;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroidx/activity/q$g;

.field public final synthetic h:I

.field public final synthetic i:Landroid/content/IntentSender$SendIntentException;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/q$g;ILandroid/content/IntentSender$SendIntentException;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/t;->g:Landroidx/activity/q$g;

    .line 5
    .line 6
    iput p2, p0, Landroidx/activity/t;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/activity/t;->i:Landroid/content/IntentSender$SendIntentException;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/activity/t;->g:Landroidx/activity/q$g;

    .line 2
    .line 3
    iget v1, p0, Landroidx/activity/t;->h:I

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/activity/t;->i:Landroid/content/IntentSender$SendIntentException;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroidx/activity/q$g;->s(Landroidx/activity/q$g;ILandroid/content/IntentSender$SendIntentException;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
