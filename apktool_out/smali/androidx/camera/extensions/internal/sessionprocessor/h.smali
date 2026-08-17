.class public final synthetic Landroidx/camera/extensions/internal/sessionprocessor/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;

.field public final synthetic h:Z

.field public final synthetic i:Ljava/util/HashMap;

.field public final synthetic j:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;ZLjava/util/HashMap;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/camera/extensions/internal/sessionprocessor/h;->g:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/camera/extensions/internal/sessionprocessor/h;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/camera/extensions/internal/sessionprocessor/h;->i:Ljava/util/HashMap;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/camera/extensions/internal/sessionprocessor/h;->j:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/extensions/internal/sessionprocessor/h;->g:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/camera/extensions/internal/sessionprocessor/h;->h:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/camera/extensions/internal/sessionprocessor/h;->i:Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/camera/extensions/internal/sessionprocessor/h;->j:Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;->a(Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor;ZLjava/util/HashMap;Landroidx/camera/extensions/internal/sessionprocessor/StillCaptureProcessor$OnCaptureResultCallback;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
