.class public interface abstract Lexpo/modules/interfaces/taskManager/TaskConsumerInterface;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# virtual methods
.method public abstract canReceiveCustomBroadcast(Ljava/lang/String;)Z
.end method

.method public abstract didCancelJob(Landroid/app/job/JobService;Landroid/app/job/JobParameters;)Z
.end method

.method public abstract didExecuteJob(Landroid/app/job/JobService;Landroid/app/job/JobParameters;)Z
.end method

.method public abstract didReceiveBroadcast(Landroid/content/Intent;)V
.end method

.method public abstract didRegister(Lexpo/modules/interfaces/taskManager/TaskInterface;)V
.end method

.method public abstract didUnregister()V
.end method

.method public abstract setOptions(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract taskType()Ljava/lang/String;
.end method
